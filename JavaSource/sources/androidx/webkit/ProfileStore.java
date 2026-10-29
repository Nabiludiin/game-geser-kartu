package androidx.webkit;

import c1.b;
import java.util.List;

/* compiled from: MyApplication */
public interface ProfileStore {
    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    b getOrCreateProfile(String str);

    b getProfile(String str);
}
