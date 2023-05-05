<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <table border="1">
                    <tr>
                        <xsl:for-each select="VIVERO/CLIENTES/CLIENTE">
                            <xsl:if test="DNI='75112318Z'">
                                <td>
                                    Nombre: <xsl:value-of select="NOMBRE"/><br/><br/>
                                    Dirección: <xsl:value-of select="DIRECCION"/><br/><br/>
                                    DNI: <xsl:value-of select="DNI"/>
                                </td>
                                <td>Pedido Nº 1</td>
                            </xsl:if>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th>Nombre</th>
                        <th>Precio</th>
                    </tr>
                    <xsl:for-each select="VIVERO/s/PLANT">
                        <xsl:sort select="PRICE" data-type="number" order="ascending"/>
                        <tr>
                            <td><xsl:value-of select="COMMON"/></td>
                            <td><xsl:value-of select="PRICE"/></td>
                        </tr>
                    </xsl:for-each>
                    <tr>
                        <td>TOTAL</td>
                        <td>xD</td>
                    </tr>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>