package def.underscore.__;
import def.js.RegExp;
@jsweet.lang.Interface
public abstract class TemplateSettings extends def.js.Object {
    @jsweet.lang.Optional
    public RegExp evaluate;
    @jsweet.lang.Optional
    public RegExp interpolate;
    @jsweet.lang.Optional
    public RegExp escape;
    @jsweet.lang.Optional
    public String variable;
}

