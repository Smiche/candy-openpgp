package def.openpgp.openpgp;
import def.js.Array;
@jsweet.lang.Interface
public abstract class Options extends def.js.Object {
	@jsweet.lang.Optional
    public String data;
	@jsweet.lang.Optional
    public Object message;
    @jsweet.lang.Optional
    public Array<def.openpgp.openpgp.key.Key> publicKeys;
    @jsweet.lang.Optional
    public Array<def.openpgp.openpgp.key.Key> privateKeys;
    @jsweet.lang.Optional
    public def.openpgp.openpgp.key.Key privateKey;
}

