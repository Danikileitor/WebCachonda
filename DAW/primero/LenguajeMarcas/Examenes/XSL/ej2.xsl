<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <carreras>
            <xsl:for-each select="universidad/carreras/carrera">
                <xsl:sort select="creditos" data-type="number" order="descending"/>
                <carrera>
                    <identificador>
                        <xsl:value-of select="@id"/>
                    </identificador>
                    <nombre>
                        <xsl:value-of select="nombre"/>
                    </nombre>
                    <creditos>
                        <xsl:value-of select="creditos"/>
                    </creditos>
                </carrera>
            </xsl:for-each>
        </carreras>
    </xsl:template>
</xsl:stylesheet>