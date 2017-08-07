package def.openpgp.openpgp;
public final class Globals {
    native public static def.js.Promise<CipherText> encrypt(Options options);
    native public static def.js.Promise<PlainText> decrypt(Options options);
}

