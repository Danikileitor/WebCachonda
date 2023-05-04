<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <ul>
                    <li>Titulo: <xsl:value-of select="libro/titulo" /></li>
                    <li>Autor: <xsl:value-of select="libro/autor" /></li>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>