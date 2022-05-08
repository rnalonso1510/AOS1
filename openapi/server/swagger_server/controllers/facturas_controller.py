import connexion
import six

from swagger_server.models.factura import Factura  # noqa: E501
from swagger_server.models.http_problem import HTTPProblem  # noqa: E501
from swagger_server import util


def api_facturas_cget():  # noqa: E501
    """Devuelve todas las facturas existentes

    Devuelve todas las facturas existentes del sistema # noqa: E501


    :rtype: object
    """
    return 'do some magic!'


def api_facturas_coptions():  # noqa: E501
    """Provides the list of HTTP supported methods.

    Return a &#x60;Allow&#x60; header with a comma separated list of HTTP supported methods. # noqa: E501


    :rtype: None
    """
    return 'do some magic!'


def api_facturas_delete(id):  # noqa: E501
    """Elimina el recurso Factura.

    Elimina el recurso Factura tras especificar su &#x60;id factura&#x60;. # noqa: E501

    :param id: **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid
    :type id: int

    :rtype: None
    """
    return 'do some magic!'


def api_facturas_get(id):  # noqa: E501
    """Devuelve una factura tras especificar su ID.

    Devuelve una factura tras especificar su &#x60;ID&#x60;. # noqa: E501

    :param id: **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid
    :type id: int

    :rtype: Factura
    """
    return 'do some magic!'


def api_facturas_options_id(id):  # noqa: E501
    """Provides the list of HTTP supported methods.

    Return a &#x60;Allow&#x60; header with a comma separated list of HTTP supported methods. # noqa: E501

    :param id: **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid
    :type id: int

    :rtype: None
    """
    return 'do some magic!'


def api_facturas_post():  # noqa: E501
    """Crea una factura.

    Crea una nueva factura # noqa: E501


    :rtype: None
    """
    return 'do some magic!'


def api_facturas_put(id):  # noqa: E501
    """Actualiza una factura determinada especificando su identificador y los campos a actualizar

    Actualiza una factura determinada especificando su id. # noqa: E501

    :param id: **ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid
    :type id: int

    :rtype: Factura
    """
    return 'do some magic!'
