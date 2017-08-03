package def.openpgp.openpgp;
import def.js.Array;
public class Options extends def.js.Object {
    public String data;
    public Array<def.openpgp.openpgp.key.Key> publicKeys;
    @jsweet.lang.Optional
    public Array<def.openpgp.openpgp.key.Key> privateKeys;
}

