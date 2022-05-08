# swagger_client.ClientesApi

All URIs are relative to *{schema}://{server}:{port}/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_facturas_get**](ClientesApi.md#api_facturas_get) | **GET** /clientes/{idCliente}/facturas/ | Devuelve todas las facturas de un cliente.

# **api_facturas_get**
> object api_facturas_get(id_cliente)

Devuelve todas las facturas de un cliente.

Devuelve todas las facturas de un cliente.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ClientesApi()
id_cliente = 56 # int | **ID**.   ID del cliente.  type: number format: uuid

try:
    # Devuelve todas las facturas de un cliente.
    api_response = api_instance.api_facturas_get(id_cliente)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientesApi->api_facturas_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cliente** | **int**| **ID**.   ID del cliente.  type: number format: uuid | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

