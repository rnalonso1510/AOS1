from typing import List, Optional

from pydantic import BaseModel


class VehiculoBase(BaseModel):
    title: str
    description: Optional[str] = None


class VehiculoCreate(VehiculoBase):
    pass


class Vehiculo(VehiculoBase):
    id: int
    owner_id: int

    class Config:
        orm_mode = True


class ClienteBase(BaseModel):
    pass
class ClienteCreate(ClienteBase):
    pass


class Cliente(ClienteBase):
    id: int
    vehiculos: List[Vehiculo] = []

    class Config:
        orm_mode = True