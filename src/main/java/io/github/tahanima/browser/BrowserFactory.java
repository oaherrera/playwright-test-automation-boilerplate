package io.github.tahanima.browser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;

import static io.github.tahanima.config.ConfigurationManager.configuration;

/**
 * @author tahanima
 */
public enum BrowserFactory {
    CHROMIUM {
        @Override
        public Browser initialize(Playwright playwright) {
            return playwright.chromium().launch(options());
        }
    },
    FIREFOX {
        @Override
        public Browser initialize(Playwright playwright) {
            return playwright.firefox().launch(options());
        }
    };

    public LaunchOptions options() {
        return new BrowserType.LaunchOptions()
                .setHeadless(configuration().headless())
                .setSlowMo(configuration().slowMotion());
    }

    public abstract Browser initialize(Playwright playwright);
}
