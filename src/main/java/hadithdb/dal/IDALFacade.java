package hadithdb.dal;

import java.util.List;

import hadithdb.dto.BookDTO;
import hadithdb.dto.ChapterDTO;
import hadithdb.dto.CollectionDTO;
import hadithdb.dto.DeletionImpactDTO;
import hadithdb.dto.HadithDTO;
import hadithdb.dto.TranslationDTO;

public interface IDALFacade extends ICollectionDAO, IBookDAO, IChapterDAO, IHadithDAO,
ITranslationDAO, IGlossaryDAO, IDeletionImpactDAO{
    DeletionImpactDTO impactOfCollection(int id);
    DeletionImpactDTO impactOfBook(int id);
    DeletionImpactDTO impactOfChapter(int id);
    DeletionImpactDTO impactOfHadith(int id);   
    
}