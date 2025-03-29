package solution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import solution.domain.LibraryStats;

@Configuration
public class LibraryConfig {
    @Bean
    public LibraryStats libraryStats() {
        return new LibraryStats();
    }
}
