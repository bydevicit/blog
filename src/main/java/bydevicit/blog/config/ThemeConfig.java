package bydevicit.blog.config;

import bydevicit.blog.libs.KTTheme;
import bydevicit.blog.libs.config.KTIconsBaseSettings;
import bydevicit.blog.libs.config.KTThemeBaseConfig;
import bydevicit.blog.libs.config.KTThemeSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class ThemeConfig {
    @Bean("theme")
    @RequestScope
    public KTTheme theme(){
        return new KTTheme();
    }

    @Bean("settings")
    public KTThemeBaseConfig settings() {
        KTThemeSettings settings = new KTThemeSettings();
        return settings.config;
    }

    @Bean("iconsSettings")
    public KTIconsBaseSettings iconsSettings(){
       return new KTIconsBaseSettings();
    }
}
