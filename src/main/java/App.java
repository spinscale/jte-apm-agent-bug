import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;

import java.nio.file.Paths;

class App {

    public static void main(String[] args) {
        {
            final TemplateEngine templateEngine = TemplateEngine.create(new DirectoryCodeResolver(Paths.get("src", "main", "resources")), ContentType.Html);
            System.out.println("before precompile all");
            templateEngine.precompileAll();
            System.out.println("after precompile all");
        }
        // uncommenting this will prevent the thrown exception below
        co.elastic.apm.attach.ElasticApmAttacher.attach();
        {
            final TemplateEngine templateEngine = TemplateEngine.create(new DirectoryCodeResolver(Paths.get("src", "main", "resources")), ContentType.Html);
            System.out.println("before precompile all");
            templateEngine.precompileAll();
            System.out.println("after precompile all");
        }
    }
}