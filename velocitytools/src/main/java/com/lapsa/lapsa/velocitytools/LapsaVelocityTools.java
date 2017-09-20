package com.lapsa.lapsa.velocitytools;

import java.io.InputStream;
import java.util.ResourceBundle;

import org.apache.velocity.VelocityContext;

import com.lapsa.international.localization.LocalizationLanguage;

public interface LapsaVelocityTools {

    VelocityContext configureDefaultVelocityContext(LocalizationLanguage language);

    String getTemplateReousrcePath(LocalizationLanguage language,
	    String templateResourceName);

    void setDefaultTemplateResourcePath(String templateResourcePath);

    String getTemplateMergedText(LocalizationLanguage language, VelocityContext context,
	    String templateResourceName) throws TemplateException;

    String getTemplateMergedText(VelocityContext context, String templateContent)
	    throws TemplateException;

    InputStream getTemplateReousrceAsStream(LocalizationLanguage language, String templateResourceName);

    ResourceBundle getResourceBundle(LocalizationLanguage language, String bundleBasename);

}