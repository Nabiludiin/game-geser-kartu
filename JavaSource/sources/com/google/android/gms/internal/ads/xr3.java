package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Base64;
import java.util.Optional;

/* compiled from: MyApplication */
final class xr3 {

    /* renamed from: a, reason: collision with root package name */
    private Optional f18983a;

    /* renamed from: b, reason: collision with root package name */
    private Optional f18984b;

    xr3() {
    }

    public final boolean a(iq iqVar) {
        Object obj;
        Object obj2;
        Base64.Decoder decoder;
        byte[] decode;
        Optional of;
        Base64.Decoder decoder2;
        byte[] decode2;
        Optional of2;
        byte[] w7 = iqVar.d0().e0().d0().w();
        byte[] w8 = iqVar.d0().g0().w();
        try {
            if (this.f18983a == null && this.f18984b == null) {
                try {
                    try {
                        ts4.a();
                        decoder = Base64.getDecoder();
                        decode = decoder.decode("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=");
                        of = Optional.of((v84) x84.a(new String(decode)).f(wi4.c(), v84.class));
                        this.f18983a = of;
                        decoder2 = Base64.getDecoder();
                        decode2 = decoder2.decode("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=");
                        of2 = Optional.of((v84) x84.a(new String(decode2)).f(wi4.c(), v84.class));
                        this.f18984b = of2;
                    } catch (Exception e8) {
                        throw new GeneralSecurityException("Failed to verify program", e8);
                    }
                } catch (GeneralSecurityException unused) {
                    return false;
                }
            }
            this.f18983a.isPresent();
            obj2 = this.f18983a.get();
            ((v84) obj2).a(w7, w8);
            return true;
        } catch (GeneralSecurityException unused2) {
            this.f18984b.isPresent();
            obj = this.f18984b.get();
            ((v84) obj).a(w7, w8);
            return true;
        }
    }
}
