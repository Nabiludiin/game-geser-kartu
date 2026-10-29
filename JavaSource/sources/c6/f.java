package c6;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import c6.t;
import c6.y;
import java.io.InputStream;

/* compiled from: MyApplication */
class f extends y {

    /* renamed from: b, reason: collision with root package name */
    private static final UriMatcher f3604b;

    /* renamed from: a, reason: collision with root package name */
    private final Context f3605a;

    /* compiled from: MyApplication */
    private static class a {
        static InputStream a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f3604b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    f(Context context) {
        this.f3605a = context;
    }

    private InputStream j(w wVar) {
        ContentResolver contentResolver = this.f3605a.getContentResolver();
        Uri uri = wVar.f3719d;
        int match = f3604b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return a.a(contentResolver, uri);
    }

    @Override // c6.y
    public boolean c(w wVar) {
        Uri uri = wVar.f3719d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f3604b.match(wVar.f3719d) != -1;
    }

    @Override // c6.y
    public y.a f(w wVar, int i7) {
        InputStream j7 = j(wVar);
        if (j7 != null) {
            return new y.a(j7, t.e.DISK);
        }
        return null;
    }
}
