from sqlalchemy.orm import Session
import bbdd.models as models
import schemas


def get_Cliente(db: Session, Cliente_id: int):
    return db.query(models.Cliente).filter(models.Cliente.id == Cliente_id).first()


def get_Cliente_by_id(db: Session, id: str):
    return db.query(models.Cliente).filter(models.Cliente.id == id).first()


def get_Clientes(db: Session, skip: int = 0, limit: int = 100):
    return db.query(models.Cliente).offset(skip).limit(limit).all()

def create_user(db: Session, user: schemas.ClienteCreate):
    db_user = models.Cliente()
    db.add(db_user)
    db.commit()
    db.refresh(db_user)
    return db_user

def get_Vehiculos(db: Session, skip: int = 0, limit: int = 100):
    return db.query(models.Vehiculo).offset(skip).limit(limit).all()


def create_Cliente_Vehiculo(db: Session, Vehiculo: schemas.VehiculoCreate, Cliente_id: int):
    db_Vehiculo = models.Vehiculo(**Vehiculo.dict(), owner_id=Cliente_id)
    db.add(db_Vehiculo)
    db.commit()
    db.refresh(db_Vehiculo)
    return db_Vehiculo

def get_clients(db: Session, skip: int = 0, limit: int = 100):
    return db.query(models.Cliente).offset(skip).limit(limit).all()