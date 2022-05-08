# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.http_problem import HTTPProblem  # noqa: E501
from swagger_server.test import BaseTestCase


class TestClientesController(BaseTestCase):
    """ClientesController integration test stubs"""

    def test_api_facturas_get(self):
        """Test case for api_facturas_get

        Devuelve todas las facturas de un cliente.
        """
        response = self.client.open(
            '/clientes/{idCliente}/facturas/'.format(id_cliente=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
