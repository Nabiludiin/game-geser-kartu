package p4;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f25511a;

    s2(Executor executor) {
        this.f25511a = executor;
    }

    public final Executor a() {
        return this.f25511a;
    }

    public final void b(final String str, final String str2, final y1... y1VarArr) {
        this.f25511a.execute(new Runnable() { // from class: p4.x0
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                if (TextUtils.isEmpty(str3)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String str4 = str2;
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str4);
                        return;
                    }
                }
                y1[] y1VarArr2 = y1VarArr;
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                for (final y1 y1Var : y1VarArr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: p4.b0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(y1.this.c(lowerCase, jSONObject));
                        }
                    });
                    y1Var.a().execute(futureTask);
                    try {
                    } catch (InterruptedException e8) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e8);
                    } catch (ExecutionException e9) {
                        Log.d("UserMessagingPlatform", "Failed to run Action[" + lowerCase + "]: ", e9.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}
