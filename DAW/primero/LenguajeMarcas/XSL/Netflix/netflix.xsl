<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Producciones de Netflix</h2>
                <table border="1">
                    <tr>
                        <th>Producción</th>
                        <th>Tipo</th>
                        <th>Creador</th>
                    </tr>
                    <xsl:for-each select="netflix/produccion">
                        <xsl:sort select="ano_estreno" data-type="number" order="descending"/>
                        <xsl:if test="nombre/@tipo='pelicula'">                            
                            <tr>
                                <td><xsl:value-of select="nombre"/></td>
                                <td><xsl:value-of select="nombre/@tipo"/></td>
                                <td><xsl:value-of select="director"/></td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>