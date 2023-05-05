<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Plantas de la zona 4 por orden alfabético</h2>
                <ul>
                    <xsl:for-each select="VIVERO/s/PLANT">
                        <xsl:sort select="COMMON"/>
                        <xsl:if test="ZONE='4'">
                            <li><xsl:value-of select="COMMON"/></li>
                        </xsl:if>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>