<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <table border="1">
                    <tr>
                        <th colspan="4">Listado de Carreras de la Universidad de Almería</th>
                    </tr>
                    <tr>
                        <th>Carrera</th>
                        <th>Plan</th>
                        <th>Créditos</th>
                        <th>Facultad</th>
                    </tr>
                    <xsl:for-each select="universidad/carreras/carrera">
                        <xsl:sort select="creditos" data-type="number" order="descending"/>
                        <tr>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="plan"/>
                            </td>
                            <td>
                                <xsl:value-of select="creditos"/>
                            </td>
                            <td>
                                <xsl:value-of select="centro"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
