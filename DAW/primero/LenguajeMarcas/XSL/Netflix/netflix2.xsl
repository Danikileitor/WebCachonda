<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <netflix>
            <xsl:for-each select="netflix/produccion">
                <xsl:if test="nombre/@tipo='serie'"/>
                <serie>
                    <nombre><xsl:value-of select="nombre"/></nombre>
                    <ano_estreno><xsl:value-of select="ano_estreno"/></ano_estreno>
                    <num_temporadas><xsl:value-of select="num_temporadas"/></num_temporadas>
                </serie>
            </xsl:for-each>
        </netflix>
    </xsl:template>
</xsl:stylesheet>