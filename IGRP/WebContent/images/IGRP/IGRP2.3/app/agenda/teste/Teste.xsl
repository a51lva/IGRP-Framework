<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" omit-xml-declaration="yes" encoding="ISO-8859-1" doctype-system="about:legacy-compat"/>
    <xsl:template match="/">
        <html>
            <head>
                <xsl:call-template name="IGRP-head"/>
                <!-- SEPARATORLIST CSS INCLUDES -->
                <link rel="stylesheet" type="text/css" href="{$path}/plugins/separatorlist/igrp.separatorlist.css"/>
                <link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/igrp.tables.css"/>
                <link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/dataTables.bootstrap.css"/>
                <!-- TOOLSBAR CSS INCLUDES -->
                <link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css"/>
                <style/>
            </head>
            <body class="{$bodyClass} sidebar-off">
                <xsl:call-template name="IGRP-topmenu"/>
                <form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data">
                    <div class="container-fluid">
                        <div class="row">
                            <xsl:call-template name="IGRP-sidebar"/>
                            <div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents">
                                <div class="content">
                                    <div class="row" id="row-818f9ce0">
                                        <div class="gen-column col-md-12">
                                            <div class="gen-inner">
                                                <xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/>
                                                <xsl:if test="rows/content/toolsbar_1">
                                                    <div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder a.btn" gen-class="" item-name="toolsbar_1">
                                                        <div class="btns-holder   pull-right" role="group">
                                                            <xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons">
                                                                <xsl:with-param name="vertical" select="'true'"/>
                                                                <xsl:with-param name="outline" select="'false'"/>
                                                            </xsl:apply-templates>
                                                        </div>
                                                    </div>
                                                </xsl:if>
                                                <xsl:if test="rows/content/separatorlist_1">
                                                    <div class="box gen-container-item " gen-class="" item-name="separatorlist_1">
                                                        <div class="box-body IGRP-separatorlist" tag="separatorlist_1" dialog="false">
                                                            <div class="splist-form-holder">
                                                                <div class="splist-form" role="form">
                                                                    <xsl:apply-templates mode="form-hidden-fields" select="rows/content/separatorlist_1/fields"/>
                                                                    <xsl:if test="rows/content/separatorlist_1/fields/cod">
                                                                        <div class="form-group col-sm-3   gen-fields-holder" item-name="cod" item-type="text">
                                                                            <label for="{rows/content/separatorlist_1/fields/cod/@name}">
                                                                                <span>
                                                                                    <xsl:value-of select="rows/content/separatorlist_1/fields/cod/label"/>
                                                                                </span>
                                                                            </label>
                                                                            <input type="text" value="{rows/content/separatorlist_1/fields/cod/value}" class="form-control " id="{rows/content/separatorlist_1/fields/cod/@name}" name="{rows/content/separatorlist_1/fields/cod/@name}" maxlength="30" placeholder=""></input>
                                                                        </div>
                                                                    </xsl:if>
                                                                    <xsl:if test="rows/content/separatorlist_1/fields/name">
                                                                        <div class="form-group col-sm-3   gen-fields-holder" item-name="name" item-type="text">
                                                                            <label for="{rows/content/separatorlist_1/fields/name/@name}">
                                                                                <span>
                                                                                    <xsl:value-of select="rows/content/separatorlist_1/fields/name/label"/>
                                                                                </span>
                                                                            </label>
                                                                            <input type="text" value="{rows/content/separatorlist_1/fields/name/value}" class="form-control " id="{rows/content/separatorlist_1/fields/name/@name}" name="{rows/content/separatorlist_1/fields/name/@name}" maxlength="100" placeholder=""></input>
                                                                        </div>
                                                                    </xsl:if>
                                                                    <xsl:if test="rows/content/separatorlist_1/fields/email">
                                                                        <div class="form-group col-sm-3   gen-fields-holder" item-name="email" item-type="text">
                                                                            <label for="{rows/content/separatorlist_1/fields/email/@name}">
                                                                                <span>
                                                                                    <xsl:value-of select="rows/content/separatorlist_1/fields/email/label"/>
                                                                                </span>
                                                                            </label>
                                                                            <input type="text" value="{rows/content/separatorlist_1/fields/email/value}" class="form-control " id="{rows/content/separatorlist_1/fields/email/@name}" name="{rows/content/separatorlist_1/fields/email/@name}" maxlength="100" placeholder=""></input>
                                                                        </div>
                                                                    </xsl:if>
                                                                </div>
                                                            </div>
                                                            <div class="table-box box-body box-table-contents splist-table">
                                                                <table rel="T_separatorlist_1" id="separatorlist_1" class="table table-striped gen-data-table">
                                                                    <thead>
                                                                        <tr>
                                                                            <xsl:if test="rows/content/separatorlist_1/fields/cod">
                                                                                <xsl:if test="not(cod/@visible)">
                                                                                    <th align="" item-name="cod">
                                                                                        <span>
                                                                                            <xsl:value-of select="rows/content/separatorlist_1/fields/cod/label"/>
                                                                                        </span>
                                                                                    </th>
                                                                                </xsl:if>
                                                                            </xsl:if>
                                                                            <xsl:if test="rows/content/separatorlist_1/fields/name">
                                                                                <xsl:if test="not(name/@visible)">
                                                                                    <th align="" item-name="name">
                                                                                        <span>
                                                                                            <xsl:value-of select="rows/content/separatorlist_1/fields/name/label"/>
                                                                                        </span>
                                                                                    </th>
                                                                                </xsl:if>
                                                                            </xsl:if>
                                                                            <xsl:if test="rows/content/separatorlist_1/fields/email">
                                                                                <xsl:if test="not(email/@visible)">
                                                                                    <th align="" item-name="email">
                                                                                        <span>
                                                                                            <xsl:value-of select="rows/content/separatorlist_1/fields/email/label"/>
                                                                                        </span>
                                                                                    </th>
                                                                                </xsl:if>
                                                                            </xsl:if>
                                                                            <th class="table-btn">
                                                                                <a class="table-row-add btn-xs btn btn-primary" title="Adicionar" data-toggle="tooltip" data-placement="left">
                                                                                    <i class="fa fa-plus"/>
                                                                                </a>
                                                                            </th>
                                                                        </tr>
                                                                    </thead>
                                                                    <tbody>
                                                                        <xsl:for-each select="rows/content/separatorlist_1/table/value/row">
                                                                            <tr>
                                                                                <input type="hidden" class="sl-row-id" name="p_separatorlist_1_id" value="{separatorlist_1_id}"/>
                                                                                <xsl:if test="cod">
                                                                                    <xsl:choose>
                                                                                        <xsl:when test="not(cod/@visible)">
                                                                                            <td field="cod" data-row="{position()}" data-title="{../../../fields/cod/label}" class="text" item-name="cod">
                                                                                                <span class="separator-list-td-val">
                                                                                                    <xsl:value-of select="cod_desc"/>
                                                                                                </span>
                                                                                                <input type="hidden" name="p_cod_fk" value="{cod}"/>
                                                                                                <input type="hidden" name="p_cod_fk_desc" value="{cod_desc}"/>
                                                                                            </td>
                                                                                        </xsl:when>
                                                                                        <xsl:otherwise>
                                                                                            <input type="hidden" name="p_cod_fk" value="{cod}"/>
                                                                                            <input type="hidden" name="p_cod_fk_desc" value="{cod_desc}"/>
                                                                                        </xsl:otherwise>
                                                                                    </xsl:choose>
                                                                                </xsl:if>
                                                                                <xsl:if test="name">
                                                                                    <xsl:choose>
                                                                                        <xsl:when test="not(name/@visible)">
                                                                                            <td field="name" data-row="{position()}" data-title="{../../../fields/name/label}" class="text" item-name="name">
                                                                                                <span class="separator-list-td-val">
                                                                                                    <xsl:value-of select="name_desc"/>
                                                                                                </span>
                                                                                                <input type="hidden" name="p_name_fk" value="{name}"/>
                                                                                                <input type="hidden" name="p_name_fk_desc" value="{name_desc}"/>
                                                                                            </td>
                                                                                        </xsl:when>
                                                                                        <xsl:otherwise>
                                                                                            <input type="hidden" name="p_name_fk" value="{name}"/>
                                                                                            <input type="hidden" name="p_name_fk_desc" value="{name_desc}"/>
                                                                                        </xsl:otherwise>
                                                                                    </xsl:choose>
                                                                                </xsl:if>
                                                                                <xsl:if test="email">
                                                                                    <xsl:choose>
                                                                                        <xsl:when test="not(email/@visible)">
                                                                                            <td field="email" data-row="{position()}" data-title="{../../../fields/email/label}" class="text" item-name="email">
                                                                                                <span class="separator-list-td-val">
                                                                                                    <xsl:value-of select="email_desc"/>
                                                                                                </span>
                                                                                                <input type="hidden" name="p_email_fk" value="{email}"/>
                                                                                                <input type="hidden" name="p_email_fk_desc" value="{email_desc}"/>
                                                                                            </td>
                                                                                        </xsl:when>
                                                                                        <xsl:otherwise>
                                                                                            <input type="hidden" name="p_email_fk" value="{email}"/>
                                                                                            <input type="hidden" name="p_email_fk_desc" value="{email_desc}"/>
                                                                                        </xsl:otherwise>
                                                                                    </xsl:choose>
                                                                                </xsl:if>
                                                                                <td data-row="{position()}" class="table-btn">
                                                                                    <xsl:if test="not(@noupdate)">
                                                                                        <span class="table-row-edit btn btn-default " rel="separatorlist_1">
                                                                                            <i class="fa fa-pencil"/>
                                                                                        </span>
                                                                                    </xsl:if>
                                                                                    <xsl:if test="not(@nodelete)">
                                                                                        <span class="table-row-remove btn btn-danger" rel="separatorlist_1">
                                                                                            <i class="fa fa-times"/>
                                                                                        </span>
                                                                                    </xsl:if>
                                                                                </td>
                                                                            </tr>
                                                                        </xsl:for-each>
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </xsl:if>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <xsl:call-template name="IGRP-bottom"/>
                </form>
                <!-- SEPARATORLIST JS INCLUDES -->
                <script type="text/javascript" src="{$path}/plugins/separatorlist/igrp.separatorlist.js"/>
                <script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js"/>
            </body>
        </html>
    </xsl:template>
    <xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=1504026145404"/>
    <xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=1504026145404"/>
    <xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=1504026145404"/>
    <xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=1504026145404"/>
    <xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=1504026145404"/>
</xsl:stylesheet>
