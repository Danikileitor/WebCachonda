﻿<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" />
    <xsl:template match="/">
        <html>
            <body>
                <h1>Libros</h1>
                <ul>
                    <li>Titulo: <xsl:value-of select="libro/titulo" /></li>
                    <li>Autor: <xsl:value-of select="libro/autor" /></li>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>