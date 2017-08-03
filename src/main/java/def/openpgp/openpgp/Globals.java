package def.openpgp.openpgp;
import def.es6_promise.Promise;
public final class Globals {
    native public static Promise<CipherText> encrypt(Options options);
    native public static Promise<PlainText> decrypt(Options options);
}

