from datetime import date


from sqlalchemy import Boolean, Column, ForeignKey, Integer, String
from sqlalchemy.orm import relationship

from database import Base




class Cliente(Base):
    __tablename__ = "clientes"

    id = Column(Integer, primary_key=True, index=True)
    vehiculos = relationship("Vehiculo",back_populates="owner")
class Vehiculo(Base):
    __tablename__ = "vehiculos"

    id = Column(Integer, primary_key=True, index=True)
    cliente = Column(Integer, ForeignKey("clientes.id"))
    owner =     relationship("Cliente",back_populates="vehiculos")
class Trabajo(Base):
    __tablename__ = "trabajos"
    id = Column(Integer,primary_key =True,index=True)
    cliente_id = Column(Integer,ForeignKey("clientes.id"))

