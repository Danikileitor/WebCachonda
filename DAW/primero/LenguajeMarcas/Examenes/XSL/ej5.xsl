<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <proyectos>
            <xsl:for-each select="universidad/alumnos/alumno[estudios/proyecto]">
                <proyecto>
                    <nombre_proyecto>
                        <xsl:value-of select="estudios/proyecto"/>
                    </nombre_proyecto>
                    <alumno>
                        <xsl:value-of select="concat(nombre, ' ', apellido1, ' ', apellido2)"/>
                    </alumno>
                </proyecto>
            </xsl:for-each>
        </proyectos>
    </xsl:template>
</xsl:stylesheet>