package com.demo.manga.view;

import com.demo.manga.data.models.Manga;

import java.util.List;

/**
 * @ProjectName: Manga
 * @Package: com.demo.manga.view
 * @ClassName: ILibraryView
 * @Description: java类作用描述
 * @Author: Viden
 * @CreateDate: 2021/8/29 16:26
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/8/29 16:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface ILibraryView extends IBaseView {
    public void showLibMangas(List<Manga> mangaList);
}
