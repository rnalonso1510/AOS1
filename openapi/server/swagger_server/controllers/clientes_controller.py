import connexion
import six

from swagger_server.models.http_problem import HTTPProblem  # noqa: E501
from swagger_server import util


def api_facturas_get(id_cliente):  # noqa: E501
    """Devuelve todas las facturas de un cliente.

    Devuelve todas las facturas de un cliente. # noqa: E501

    :param id_cliente: **ID**.   ID del cliente.  type: number format: uuid
    :type id_cliente: int

    :rtype: object
    """
    return 'do some magic!'
