package f2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* compiled from: MyApplication */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23649a;

    /* renamed from: b, reason: collision with root package name */
    private final g2.d f23650b;

    /* renamed from: c, reason: collision with root package name */
    private final f f23651c;

    public d(Context context, g2.d dVar, f fVar) {
        this.f23649a = context;
        this.f23650b = dVar;
        this.f23651c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i7, int i8) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i9 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i7) {
                if (i9 >= i8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f2.x
    public void a(y1.o oVar, int i7) {
        b(oVar, i7, false);
    }

    @Override // f2.x
    public void b(y1.o oVar, int i7, boolean z7) {
        ComponentName componentName = new ComponentName(this.f23649a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f23649a.getSystemService("jobscheduler");
        int c8 = c(oVar);
        if (!z7 && d(jobScheduler, c8, i7)) {
            c2.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long c02 = this.f23650b.c0(oVar);
        JobInfo.Builder c9 = this.f23651c.c(new JobInfo.Builder(c8, componentName), oVar.d(), c02, i7);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i7);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", j2.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        c9.setExtras(persistableBundle);
        c2.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c8), Long.valueOf(this.f23651c.g(oVar.d(), c02, i7)), Long.valueOf(c02), Integer.valueOf(i7));
        jobScheduler.schedule(c9.build());
    }

    int c(y1.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f23649a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(j2.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
