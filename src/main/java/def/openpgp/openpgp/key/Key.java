package def.openpgp.openpgp.key;
@jsweet.lang.Interface
public abstract class Key extends def.js.Object {
    native public Object decrypt(String passphrase);
}

