package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.c;
import java.util.HashMap;

/* compiled from: MyApplication */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: q, reason: collision with root package name */
    int f2695q = 0;

    /* renamed from: r, reason: collision with root package name */
    final HashMap f2696r = new HashMap();

    /* renamed from: s, reason: collision with root package name */
    final RemoteCallbackList f2697s = new a();

    /* renamed from: t, reason: collision with root package name */
    private final c.a f2698t = new b();

    /* compiled from: MyApplication */
    class a extends RemoteCallbackList {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.b bVar, Object obj) {
            HashMap hashMap = MultiInstanceInvalidationService.this.f2696r;
            Integer num = (Integer) obj;
            num.intValue();
            hashMap.remove(num);
        }
    }

    /* compiled from: MyApplication */
    class b extends c.a {
        b() {
        }

        @Override // androidx.room.c
        public void S7(androidx.room.b bVar, int i7) {
            synchronized (MultiInstanceInvalidationService.this.f2697s) {
                MultiInstanceInvalidationService.this.f2697s.unregister(bVar);
                MultiInstanceInvalidationService.this.f2696r.remove(Integer.valueOf(i7));
            }
        }

        @Override // androidx.room.c
        public int b3(androidx.room.b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f2697s) {
                try {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i7 = multiInstanceInvalidationService.f2695q + 1;
                    multiInstanceInvalidationService.f2695q = i7;
                    if (multiInstanceInvalidationService.f2697s.register(bVar, Integer.valueOf(i7))) {
                        MultiInstanceInvalidationService.this.f2696r.put(Integer.valueOf(i7), str);
                        return i7;
                    }
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                    multiInstanceInvalidationService2.f2695q--;
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.room.c
        public void r7(int i7, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f2697s) {
                try {
                    String str = (String) MultiInstanceInvalidationService.this.f2696r.get(Integer.valueOf(i7));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int beginBroadcast = MultiInstanceInvalidationService.this.f2697s.beginBroadcast();
                    for (int i8 = 0; i8 < beginBroadcast; i8++) {
                        try {
                            Integer num = (Integer) MultiInstanceInvalidationService.this.f2697s.getBroadcastCookie(i8);
                            int intValue = num.intValue();
                            String str2 = (String) MultiInstanceInvalidationService.this.f2696r.get(num);
                            if (i7 != intValue && str.equals(str2)) {
                                try {
                                    ((androidx.room.b) MultiInstanceInvalidationService.this.f2697s.getBroadcastItem(i8)).u2(strArr);
                                } catch (RemoteException e8) {
                                    Log.w("ROOM", "Error invoking a remote callback", e8);
                                }
                            }
                        } finally {
                            MultiInstanceInvalidationService.this.f2697s.finishBroadcast();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2698t;
    }
}
