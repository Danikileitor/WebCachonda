<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <netflix>
            <peliculas>
                <xsl:for-each select="netflix/produccion">
                    <xsl:if test="nombre/@tipo='pelicula'">
                        <pelicula>
                            <nombre>
                                <xsl:value-of select="nombre" />
                            </nombre>
                            <director>
                                <xsl:value-of select="director" />
                            </director>
                        </pelicula>
                    </xsl:if>
                </xsl:for-each>
            </peliculas>
            <series>
                <xsl:for-each select="netflix/produccion">
                    <xsl:if test="nombre/@tipo='serie'">
                        <serie>
                            <nombre>
                                <xsl:choose>
                                    <xsl:when test="num_temporadas>'4'">
                                        <xsl:attribute name="larga">si</xsl:attribute>
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <xsl:attribute name="larga">no</xsl:attribute>
                                    </xsl:otherwise>
                                </xsl:choose>
                                <xsl:value-of select="nombre" />
                            </nombre>
                            <director>
                                <xsl:value-of select="director" />
                            </director>
                            <num_temporadas>
                                <xsl:value-of select="num_temporadas" />
                            </num_temporadas>
                        </serie>
                    </xsl:if>
                </xsl:for-each>
            </series>
            <documentales>
                <xsl:for-each select="netflix/produccion">
                    <xsl:if test="nombre/@tipo='documental'">
                        <documental>
                            <nombre>
                                <xsl:value-of select="nombre" />
                            </nombre>
                            <director>
                                <xsl:value-of select="director" />
                            </director>
                        </documental>
                    </xsl:if>
                </xsl:for-each>
            </documentales>
        </netflix>
    </xsl:template>
</xsl:stylesheet>