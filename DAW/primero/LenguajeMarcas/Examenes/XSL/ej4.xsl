<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <universidad>
            <carreras>
                <xsl:for-each select="universidad/carreras/carrera">
                    <nombre_carrera>
                        <xsl:value-of select="nombre"/>
                    </nombre_carrera>
                </xsl:for-each>
            </carreras>
            <asignaturas>
                <xsl:for-each select="universidad/asignaturas/asignatura">
                    <nombre_asignatura>
                        <xsl:value-of select="nombre"/>
                    </nombre_asignatura>
                </xsl:for-each>
            </asignaturas>
        </universidad>
    </xsl:template>
</xsl:stylesheet>