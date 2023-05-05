<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Plantas ordenadas por precio</h2>
                <table border="1">
                    <tr>
                        <th>Nombre común</th>
                        <th>Nombre científico</th>
                        <th>Zona</th>
                        <th>Precio</th>
                    </tr>
                    <xsl:for-each select="VIVERO/s/PLANT">
                        <xsl:sort select="PRICE" data-type="number" order="ascending"/>
                        <tr>
                            <td><xsl:value-of select="COMMON"/></td>
                            <td><xsl:value-of select="BOTANICAL"/></td>
                            <td><xsl:value-of select="ZONE"/></td>
                            <td><xsl:value-of select="PRICE"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>