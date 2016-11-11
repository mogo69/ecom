package com.mogo.ecom.application.repository;

public interface Repository<Entity, Key> {
	
	public Key create(Entity entity);
	public void update(Entity entity);
	public void delete(Entity entity);
	
	public Entity find(Key key);

}
