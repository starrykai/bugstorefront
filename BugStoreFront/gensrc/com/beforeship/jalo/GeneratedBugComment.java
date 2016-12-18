/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2016-12-18 12:17:12                         ---
 * ----------------------------------------------------------------
 */
package com.beforeship.jalo;

import com.beforeship.constants.BugStoreFrontConstants;
import com.beforeship.jalo.Bug;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BugComment}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBugComment extends GenericItem
{
	/** Qualifier of the <code>BugComment.username</code> attribute **/
	public static final String USERNAME = "username";
	/** Qualifier of the <code>BugComment.content</code> attribute **/
	public static final String CONTENT = "content";
	/** Qualifier of the <code>BugComment.bug</code> attribute **/
	public static final String BUG = "bug";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BUG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBugComment> BUGHANDLER = new BidirectionalOneToManyHandler<GeneratedBugComment>(
	BugStoreFrontConstants.TC.BUGCOMMENT,
	false,
	"bug",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(USERNAME, AttributeMode.INITIAL);
		tmp.put(CONTENT, AttributeMode.INITIAL);
		tmp.put(BUG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.bug</code> attribute.
	 * @return the bug
	 */
	public Bug getBug(final SessionContext ctx)
	{
		return (Bug)getProperty( ctx, BUG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.bug</code> attribute.
	 * @return the bug
	 */
	public Bug getBug()
	{
		return getBug( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.bug</code> attribute. 
	 * @param value the bug
	 */
	public void setBug(final SessionContext ctx, final Bug value)
	{
		BUGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.bug</code> attribute. 
	 * @param value the bug
	 */
	public void setBug(final Bug value)
	{
		setBug( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.content</code> attribute.
	 * @return the content
	 */
	public String getContent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.content</code> attribute.
	 * @return the content
	 */
	public String getContent()
	{
		return getContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final String value)
	{
		setContent( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BUGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.username</code> attribute.
	 * @return the username
	 */
	public String getUsername(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.username</code> attribute.
	 * @return the username
	 */
	public String getUsername()
	{
		return getUsername( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.username</code> attribute. 
	 * @param value the username
	 */
	public void setUsername(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.username</code> attribute. 
	 * @param value the username
	 */
	public void setUsername(final String value)
	{
		setUsername( getSession().getSessionContext(), value );
	}
	
}
