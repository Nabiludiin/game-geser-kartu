package d1;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* compiled from: MyApplication */
public class m implements ProfileStore {

    /* renamed from: b, reason: collision with root package name */
    private static ProfileStore f23070b;

    /* renamed from: a, reason: collision with root package name */
    private final ProfileStoreBoundaryInterface f23071a;

    private m(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f23071a = profileStoreBoundaryInterface;
    }

    public static ProfileStore a() {
        if (f23070b == null) {
            f23070b = new m(t.c().getProfileStore());
        }
        return f23070b;
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(String str) {
        if (s.f23084c0.d()) {
            return this.f23071a.deleteProfile(str);
        }
        throw s.a();
    }

    @Override // androidx.webkit.ProfileStore
    public List getAllProfileNames() {
        if (s.f23084c0.d()) {
            return this.f23071a.getAllProfileNames();
        }
        throw s.a();
    }

    @Override // androidx.webkit.ProfileStore
    public c1.b getOrCreateProfile(String str) {
        if (s.f23084c0.d()) {
            return new l((ProfileBoundaryInterface) h7.a.a(ProfileBoundaryInterface.class, this.f23071a.getOrCreateProfile(str)));
        }
        throw s.a();
    }

    @Override // androidx.webkit.ProfileStore
    public c1.b getProfile(String str) {
        if (!s.f23084c0.d()) {
            throw s.a();
        }
        InvocationHandler profile = this.f23071a.getProfile(str);
        if (profile != null) {
            return new l((ProfileBoundaryInterface) h7.a.a(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }
}
