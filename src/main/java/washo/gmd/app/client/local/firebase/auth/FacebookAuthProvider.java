package washo.gmd.app.client.local.firebase.auth;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "firebase.auth", name = "FacebookAuthProvider")
public class FacebookAuthProvider extends AuthProvider {

    @JsConstructor
    public FacebookAuthProvider() {
    }

    @JsMethod
    public static native AuthCredential credential(String token);
}