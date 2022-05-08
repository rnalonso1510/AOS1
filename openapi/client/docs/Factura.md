# Factura

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**factura_id** | **int** | Identificador de la factura | [optional] 
**id_cliente** | **int** | Identificador del cliente a facturar | [optional] 
**conceptos** | [**list[SchemasTrabajoYml]**](SchemasTrabajoYml.md) | Trabajos pertenecientes a la factura | [optional] 
**fecha_emision** | **datetime** | Fecha de emisión de la factura | [optional] 
**importe** | **float** | Importe total de la factura. Suma de todos los importes. | [optional] 
**links** | **object** | Enlaces de relación | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

