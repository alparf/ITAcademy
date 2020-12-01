package HomeWork7.Factorys;

import HomeWork7.Loaders.ABLoader;
import HomeWork7.Loaders.NBRBLoader;
import HomeWork7.Loaders.SiteLoader;

public class LoaderFactory {
    public static SiteLoader newABLoader() {
        return new ABLoader();
    }

    public static SiteLoader newNBRBLoader() {
        return new NBRBLoader();
    }

    private LoaderFactory() {}
}
