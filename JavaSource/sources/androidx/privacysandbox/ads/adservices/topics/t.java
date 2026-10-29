package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f2587a = new t();

    private t() {
    }

    public final i a(GetTopicsResponse getTopicsResponse) {
        List topics;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        q6.i.e(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        topics = getTopicsResponse.getTopics();
        Iterator it = topics.iterator();
        while (it.hasNext()) {
            Topic a8 = k.a(it.next());
            taxonomyVersion = a8.getTaxonomyVersion();
            modelVersion = a8.getModelVersion();
            topicId = a8.getTopicId();
            arrayList.add(new v(taxonomyVersion, modelVersion, topicId));
        }
        return new i(arrayList);
    }

    public final i b(GetTopicsResponse getTopicsResponse) {
        List topics;
        List encryptedTopics;
        byte[] encryptedTopic;
        String keyIdentifier;
        byte[] encapsulatedKey;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        q6.i.e(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        topics = getTopicsResponse.getTopics();
        Iterator it = topics.iterator();
        while (it.hasNext()) {
            Topic a8 = k.a(it.next());
            taxonomyVersion = a8.getTaxonomyVersion();
            modelVersion = a8.getModelVersion();
            topicId = a8.getTopicId();
            arrayList.add(new v(taxonomyVersion, modelVersion, topicId));
        }
        ArrayList arrayList2 = new ArrayList();
        encryptedTopics = getTopicsResponse.getEncryptedTopics();
        Iterator it2 = encryptedTopics.iterator();
        while (it2.hasNext()) {
            EncryptedTopic a9 = p.a(it2.next());
            encryptedTopic = a9.getEncryptedTopic();
            q6.i.d(encryptedTopic, "encryptedTopic.encryptedTopic");
            keyIdentifier = a9.getKeyIdentifier();
            q6.i.d(keyIdentifier, "encryptedTopic.keyIdentifier");
            encapsulatedKey = a9.getEncapsulatedKey();
            q6.i.d(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new a(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new i(arrayList, arrayList2);
    }
}
