# swagger_client.FacturasApi

All URIs are relative to *{schema}://{server}:{port}/{basePath}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_facturas_cget**](FacturasApi.md#api_facturas_cget) | **GET** /facturas | Devuelve todas las facturas existentes
[**api_facturas_coptions**](FacturasApi.md#api_facturas_coptions) | **OPTIONS** /facturas | Provides the list of HTTP supported methods.
[**api_facturas_delete**](FacturasApi.md#api_facturas_delete) | **DELETE** /facturas/{id} | Elimina el recurso Factura.
[**api_facturas_get**](FacturasApi.md#api_facturas_get) | **GET** /facturas/{id} | Devuelve una factura tras especificar su ID.
[**api_facturas_options_id**](FacturasApi.md#api_facturas_options_id) | **OPTIONS** /facturas/{id} | Provides the list of HTTP supported methods.
[**api_facturas_post**](FacturasApi.md#api_facturas_post) | **POST** /facturas | Crea una factura.
[**api_facturas_put**](FacturasApi.md#api_facturas_put) | **PUT** /facturas/{id} | Actualiza una factura determinada especificando su identificador y los campos a actualizar

# **api_facturas_cget**
> object api_facturas_cget()

Devuelve todas las facturas existentes

Devuelve todas las facturas existentes del sistema

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.FacturasApi()

try:
    # Devuelve todas las facturas existentes
    api_response = api_instance.api_facturas_cget()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FacturasApi->api_facturas_cget: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_facturas_coptions**
> api_facturas_coptions()

Provides the list of HTTP supported methods.

Return a `Allow` header with a comma separated list of HTTP supported methods.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.FacturasApi()

try:
    # Provides the list of HTTP supported methods.
    api_instance.api_facturas_coptions()
except ApiException as e:
    print("Exception when calling FacturasApi->api_facturas_coptions: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_facturas_delete**
> api_facturas_delete(id)

Elimina el recurso Factura.

Elimina el recurso Factura tras especificar su `id factura`.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.FacturasApi()
id = 56 # int | **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid

try:
    # Elimina el recurso Factura.
    api_instance.api_facturas_delete(id)
except ApiException as e:
    print("Exception when calling FacturasApi->api_facturas_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_facturas_get**
> Factura api_facturas_get(id)

Devuelve una factura tras especificar su ID.

Devuelve una factura tras especificar su `ID`.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.FacturasApi()
id = 56 # int | **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid

try:
    # Devuelve una factura tras especificar su ID.
    api_response = api_instance.api_facturas_get(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FacturasApi->api_facturas_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid | 

### Return type

[**Factura**](Factura.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_facturas_options_id**
> api_facturas_options_id(id)

Provides the list of HTTP supported methods.

Return a `Allow` header with a comma separated list of HTTP supported methods.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.FacturasApi()
id = 56 # int | **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid

try:
    # Provides the list of HTTP supported methods.
    api_instance.api_facturas_options_id(id)
except ApiException as e:
    print("Exception when calling FacturasApi->api_facturas_options_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_facturas_post**
> api_facturas_post()

Crea una factura.

Crea una nueva factura

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.FacturasApi()

try:
    # Crea una factura.
    api_instance.api_facturas_post()
except ApiException as e:
    print("Exception when calling FacturasApi->api_facturas_post: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_facturas_put**
> Factura api_facturas_put(id)

Actualiza una factura determinada especificando su identificador y los campos a actualizar

Actualiza una factura determinada especificando su id.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.FacturasApi()
id = 56 # int | **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid

try:
    # Actualiza una factura determinada especificando su identificador y los campos a actualizar
    api_response = api_instance.api_facturas_put(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FacturasApi->api_facturas_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid | 

### Return type

[**Factura**](Factura.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

