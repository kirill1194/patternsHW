using patterns_task4.Models.Interfaces;

namespace patterns_task4.FirstOrmLibrary
{
    public interface IFirstOrm<TDbEntity> where TDbEntity : IDbEntity
    {
        void Create(TDbEntity entity);
        TDbEntity Read(int id);
        void Update(TDbEntity entity);
        void Delete(TDbEntity entity);
    }
}
