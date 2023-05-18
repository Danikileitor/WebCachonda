<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Listado de alumnos matriculados en Ingeniería del Software</h2>
                <ul>
                    <xsl:for-each select="universidad/alumnos/alumno[estudios/asignaturas/asignatura/@codigo = 'a02']">
                        <li>
                            <xsl:value-of select="nombre"/><xsl:text> </xsl:text><xsl:value-of select="apellido1"/><xsl:text> </xsl:text><xsl:value-of select="apellido2"/>
                        </li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>