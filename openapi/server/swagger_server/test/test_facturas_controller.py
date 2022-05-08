# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.factura import Factura  # noqa: E501
from swagger_server.models.http_problem import HTTPProblem  # noqa: E501
from swagger_server.test import BaseTestCase


class TestFacturasController(BaseTestCase):
    """FacturasController integration test stubs"""

    def test_api_facturas_cget(self):
        """Test case for api_facturas_cget

        Devuelve todas las facturas existentes
        """
        response = self.client.open(
            '/facturas',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_facturas_coptions(self):
        """Test case for api_facturas_coptions

        Provides the list of HTTP supported methods.
        """
        response = self.client.open(
            '/facturas',
            method='OPTIONS')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_facturas_delete(self):
        """Test case for api_facturas_delete

        Elimina el recurso Factura.
        """
        response = self.client.open(
            '/facturas/{id}'.format(id=56),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_facturas_get(self):
        """Test case for api_facturas_get

        Devuelve una factura tras especificar su ID.
        """
        response = self.client.open(
            '/facturas/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_facturas_options_id(self):
        """Test case for api_facturas_options_id

        Provides the list of HTTP supported methods.
        """
        response = self.client.open(
            '/facturas/{id}'.format(id=56),
            method='OPTIONS')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_facturas_post(self):
        """Test case for api_facturas_post

        Crea una factura.
        """
        response = self.client.open(
            '/facturas',
            method='POST',
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_facturas_put(self):
        """Test case for api_facturas_put

        Actualiza una factura determinada especificando su identificador y los campos a actualizar
        """
        response = self.client.open(
            '/facturas/{id}'.format(id=56),
            method='PUT',
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
