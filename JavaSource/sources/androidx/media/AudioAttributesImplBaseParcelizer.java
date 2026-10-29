package androidx.media;

import androidx.versionedparcelable.a;

/* compiled from: MyApplication */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2562a = aVar.p(audioAttributesImplBase.f2562a, 1);
        audioAttributesImplBase.f2563b = aVar.p(audioAttributesImplBase.f2563b, 2);
        audioAttributesImplBase.f2564c = aVar.p(audioAttributesImplBase.f2564c, 3);
        audioAttributesImplBase.f2565d = aVar.p(audioAttributesImplBase.f2565d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f2562a, 1);
        aVar.F(audioAttributesImplBase.f2563b, 2);
        aVar.F(audioAttributesImplBase.f2564c, 3);
        aVar.F(audioAttributesImplBase.f2565d, 4);
    }
}
