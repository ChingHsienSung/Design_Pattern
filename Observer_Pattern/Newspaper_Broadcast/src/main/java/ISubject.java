public interface ISubject {
    public void registerCustomer(IObserver customer);
    public void removeCustomer(IObserver customer);
    public void notifyCustomer(String content);
}
