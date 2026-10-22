package hadithdb.dal;

import java.util.List;

import hadithdb.dto.BookDTO;
import hadithdb.dto.ChapterDTO;
import hadithdb.dto.CollectionDTO;
import hadithdb.dto.DeletionImpactDTO;
import hadithdb.dto.HadithDTO;
import hadithdb.dto.TranslationDTO;

public interface IDALFacade 
{
    int insertCollection(CollectionDTO dto);
    boolean updateCollection(CollectionDTO dto);
    CollectionDTO getCollectionById(int id);
    List<CollectionDTO> getAllCollections();
    boolean deleteCollection(int id);
    boolean collectionExists(int id);

    int insertBook(BookDTO book);
    boolean updateBook(BookDTO book);
    boolean deleteBook(int id);
    BookDTO getBookById(int id);
    List<BookDTO> getBooksByCollection(int collectionId);
    boolean isBookNumberExists(int collectionId, int bookNumber, int excludeBookId);
    DeletionImpactDTO getBookDeletionImpact(int bookId);

    int insertChapter(ChapterDTO chapter);
    boolean updateChapter(ChapterDTO chapter);
    boolean deleteChapter(int id);
    ChapterDTO getChapterById(int id);
    List<ChapterDTO> getChaptersByBook(int bookId);
    boolean isChapterNumberExists(int bookId, int chapterNumber, int excludeChapterId);
    boolean chapterExists(int id);
    DeletionImpactDTO getChapterDeletionImpact(int chapterId);

    DeletionImpactDTO impactOfCollection(int id);
    DeletionImpactDTO impactOfBook(int id);
    DeletionImpactDTO impactOfChapter(int id);
    DeletionImpactDTO impactOfHadith(int id);

    int insertHadithWithTranslation(HadithDTO hadith, TranslationDTO firstTranslation);
    boolean updateHadith(HadithDTO dto);
    HadithDTO getHadithById(int id);
    List<HadithDTO> getHadithByChapterId(int chapterId);
    boolean deleteHadith(int id);
    boolean hadithExists(int id);
    boolean hadithNumberExists(int chaperId, String hadithNumber, int excludeId);

    int insertTranslation(TranslationDTO dto);
    boolean updateTranslation(TranslationDTO dto);
    TranslationDTO getTranslationById(int id);
    List<TranslationDTO> getTranslationsByHadithId(int hadithId);
    boolean deleteTranslation(int id);
    boolean languageExists(int hadithId, String language, int excludeId);
    int countTranslation(int hadithId);
}