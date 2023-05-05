<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Producciones de Netflix</h2>
                <ul>
                    <xsl:for-each select="netflix/produccion">
                        <xsl:sort select="num_temporadas" data-type="number"/>
                        <xsl:if test="nombre/@tipo='serie'">
                            <li><xsl:value-of select="nombre"/> - <xsl:value-of select="num_temporadas"/></li>
                        </xsl:if>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>