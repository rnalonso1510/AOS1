from typing import List,Optional

from fastapi import Depends, FastAPI, HTTPException
from sqlalchemy.orm import Session

import crud, models, schemas
from database import SessionLocal, engine

models.Base.metadata.create_all(bind=engine)

app = FastAPI()
# Dependency
def get_db():
    db = SessionLocal()
    try:
        yield db
    finally:
        db.close()


@app.get("/")
async def read_root():
    return "Hello World"


@app.get("/items/{item_id}")
async def read_item(item_id: int, q: Optional[str] = None):
    return {"item_id": item_id, "q": q}

@app.get("/facturas/{factura_id}")
async def read_item(factura_id: int, q: Optional[str] = None):
    return {"factura_id":factura_id}


@app.post("/clientes/", response_model=schemas.Cliente)
def create_user(user: schemas.Cliente, db: Session = Depends(get_db)):
    db_user = crud.get_Cliente(db, Cliente_id=user.id)
    if db_user:
        raise HTTPException(status_code=400, detail="Cliente already registered")
    return crud.create_user(db=db, user=user)

@app.get("/clientes/", response_model=List[schemas.Cliente])
def read_users(skip: int = 0, limit: int = 100, db: Session = Depends(get_db)):
    users = crud.get_clients(db, skip=skip, limit=limit)
    return users
  