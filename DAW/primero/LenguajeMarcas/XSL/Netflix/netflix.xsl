<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Producciones de Netflix</h2>
                <ul>
                    <xsl:for-each select="netflix/produccion">
                        <li><xsl:value-of select="nombre"/> creado por <xsl:value-of select="director"/></li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>